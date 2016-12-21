package solutions

object Example extends App {

  case class Department(courses: List[Course])

  case class Course(participants: List[Participant])

  case class Participant(name: Option[String])

  def participantsName(dept: Department): List[String] = {
    for (
      course <- dept.courses;
      participant <- course.participants;
      optName <- participant.name
    ) yield optName
  }



  println(participantsName(Department(List(Course(List(Participant(Some("Moshe")), Participant(None), Participant(Some("Dani"))))))))

}
