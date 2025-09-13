package models

case class Comment(id: Int, postId: Int, text: String, authorName: String)
