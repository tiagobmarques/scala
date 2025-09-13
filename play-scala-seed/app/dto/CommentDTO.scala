package dto

case class CommentDTO(id: Int, postId: Int, text: String, authorName: String, createdAt: Option[String] = None)
