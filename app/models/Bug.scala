//package models
//
//import play.api.db._
//import play.api.Play.current
//
//
//
//object Bug {
//
//  def all(): List[Bug] = DB.withConnection { implicit c =>
//    SQL("select * from task").as(task *)
//  }
//
//  def create(title: String, description: String, status: String) {}
//
//  def delete(id: Long) {}
//
//}