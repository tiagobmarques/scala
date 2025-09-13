package mappers

import dto.PostDTO
import models.Post
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object PostMapper {
  
  def toDTO(post: Post): PostDTO =
    PostDTO(
      id = post.id,
      content = post.content,
      createdAt = Some(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    )

  def toDTOList(posts: Seq[Post]): Seq[PostDTO] = posts.map(toDTO)
}
