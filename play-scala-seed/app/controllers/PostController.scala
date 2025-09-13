package controllers

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Result}
import services.PostService
import mappers.PostMapper
import utils.JsonFormats._

import javax.inject.{Inject, Singleton}

@Singleton
class PostController @Inject()(cc: ControllerComponents,
                              postService: PostService
                             )
  extends AbstractController(cc) {

  def ping = Action {
    Ok("Hello, Post Controller!")
  }

  def getPost(postId: Int) = Action {
    postService.getPost(postId) match {
      case Some(post) => Ok(Json.toJson(PostMapper.toDTO(post)))
      case None => NotFound
    }
  }
}
