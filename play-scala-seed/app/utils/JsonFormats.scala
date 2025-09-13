package utils

import play.api.libs.json.{Json, OFormat}
import models.{Post, Comment}
import dto.{PostDTO, CommentDTO}

object JsonFormats {
  // Models
  implicit val postFormat: OFormat[Post] = Json.format[Post]
  implicit val commentFormat: OFormat[Comment] = Json.format[Comment]
  
  // DTOs
  implicit val postDTOFormat: OFormat[PostDTO] = Json.format[PostDTO]
  implicit val commentDTOFormat: OFormat[CommentDTO] = Json.format[CommentDTO]
}
