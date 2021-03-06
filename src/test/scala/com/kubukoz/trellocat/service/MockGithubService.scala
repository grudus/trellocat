package com.kubukoz.trellocat.service

import com.kubukoz.trellocat.domain.Github._
import com.kubukoz.trellocat.domain.GithubToken

import scala.concurrent.{ExecutionContext, Future}

//noinspection NotImplementedCode
class MockGithubService extends GithubService {
  override def createProject(user: User, repo: Repo, projectStub: ProjectStub)
                            (implicit githubToken: GithubToken, ec: ExecutionContext): Future[Project] = ???

  override def allRepos(implicit githubToken: GithubToken, ec: ExecutionContext): Future[List[Repo]] = ???

  override def createCard(user: User, project: Project, repo: Repo, column: Column, card: Card)
                         (implicit githubToken: GithubToken, ec: ExecutionContext): Future[Card] = ???

  override def createColumn(user: User, project: Project, repo: Repo, columnStub: ColumnStub)
                           (implicit githubToken: GithubToken, ec: ExecutionContext): Future[Column] = ???

  override def getUser()(implicit githubToken: GithubToken, ec: ExecutionContext): Future[User] = ???
}
