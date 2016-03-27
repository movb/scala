case class Book(title: String, authors: List[String])

val books: List[Book] = List(
  Book(title = "Some title",
    authors = List("Abelson, Harald", "Sussma")),
  Book(title = "Some more nice title",
    authors = List("Harald", "Yokogama"))
)

for (b<-books; a<-b.authors if a startsWith "Abe")
  yield b.title