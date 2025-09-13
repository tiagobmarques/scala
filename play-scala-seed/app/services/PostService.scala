package services

import javax.inject.{Inject, Singleton}
import models.Post
import repositories.DataRepository

@Singleton
class PostService @Inject()(dataRepository: DataRepository) {
  
  def getPost(postId: Int): Option[Post] =  dataRepository.getPost(postId)

  def getAllPosts(): Seq[Post] = {
    // Assumindo que existe um método getAllPosts no repository
    // Por enquanto, vamos retornar uma lista vazia ou implementar conforme necessário
    Seq.empty
  }
}
