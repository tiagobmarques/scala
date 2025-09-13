package dto

case class PostDTO(id: Int, content: String, createdAt: Option[String] = None)
