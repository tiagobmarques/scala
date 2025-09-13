package controllers

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Result}
import services.CommentService
import mappers.CommentMapper
import utils.JsonFormats._

import javax.inject.{Inject, Singleton}

@Singleton
class CommentController @Inject()(cc: ControllerComponents,
                                 commentService: CommentService
                                )
  extends AbstractController(cc) {

  def ping = Action {
    Ok("Hello, Comment Controller!")
  }

  def getComments(postId: Int): Action[AnyContent] = Action {
    commentService.getComments(postId)
      .map(CommentMapper.toDTO) match {
      case Nil => NotFound
      case comments => Ok(Json.toJson(comments))
    }
  }
}
