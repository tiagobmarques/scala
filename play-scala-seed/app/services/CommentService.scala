package services

import javax.inject.{Inject, Singleton}
import models.Comment
import repositories.DataRepository

@Singleton
class CommentService @Inject()(dataRepository: DataRepository) {
  
  def getComments(postId: Int): Seq[Comment] = {
    dataRepository.getComments(postId)
  }
  
  def getComment(commentId: Int): Option[Comment] = None
}
