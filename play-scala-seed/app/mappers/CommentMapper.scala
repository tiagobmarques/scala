package mappers

import dto.CommentDTO
import models.Comment
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object CommentMapper {
  
  def toDTO(comment: Comment): CommentDTO =
    CommentDTO(
      id = comment.id,
      postId = comment.postId,
      text = comment.text,
      authorName = comment.authorName,
      createdAt = Some(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    )
}
