package controllers

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Result}
import repositories.DataRepository

import javax.inject.{Inject, Singleton}

@Singleton
class ApiController @Inject()(cc: ControllerComponents,
                              dataRepository: DataRepository
                             )
  extends AbstractController(cc) {

  def ping = Action { 
    Ok("Hello, Scala!")
  }

//  def getPost(postId: Int) = Action {
//    dataRepository.getPost(postId) map { post =>
//      Ok(Json.toJson(post))
//    } getOrElse NotFound
//  }
  
  def getPost(postId: Int) = Action {
    dataRepository.getPost(postId).fold[Result](NotFound)(post => Ok(Json.toJson(post)))
  }

  def getComments(postId: Int): Action[AnyContent] = Action {
    Ok(Json.toJson(dataRepository.getComments(postId)))
  }
}