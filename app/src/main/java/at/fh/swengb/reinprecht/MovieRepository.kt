package at.fh.swengb.reinprecht

object MovieRepository {

    private val movies: List<Movie>

    init {
        val lecturerIllis = Lecturer("Sanja Illis")
        val lecturerBloder = Lecturer("Lukas Bloder")
        movies = listOf(
            Movie("0",
                "Lecture 0",
                "09.10.2019",
                "Introduction",
                LessonType.LECTURE,
                listOf( lecturerIllis, lecturerBloder ),
                mutableListOf()
            ),
            Movie("1",
                "Lecture 1",
                "09.10.2019",
                "OOP Basics",
                LessonType.LECTURE,
                listOf( lecturerIllis ),
                mutableListOf()
            ),
            Movie("2",
                "Exercise 1",
                "10.10.2019",
                "OOP Basics",
                LessonType.PRACTICAL,
                listOf( lecturerIllis ),
                mutableListOf()
            ),
            Movie("3",
                "Lecture 2",
                "17.10.2019",
                "SCM",
                LessonType.LECTURE,
                listOf( lecturerIllis ),
                mutableListOf()
            ),
            Movie("4",
                "Exercise 2",
                "17.10.2019",
                "SCM",
                LessonType.PRACTICAL,
                listOf( lecturerIllis ),
                mutableListOf()
            ),
            Movie("5",
                "Lecture 3",
                "29.10.2019",
                "Software Design",
                LessonType.LECTURE,
                listOf( lecturerIllis ),
                mutableListOf()
            ),
            Movie("6",
                "Lecture 4",
                "30.10.2019",
                "Android Basics",
                LessonType.LECTURE,
                listOf( lecturerBloder ),
                mutableListOf( )
            ),
            Movie("7",
                "Exercise 4",
                "30.10.2019",
                "Android Basics",
                LessonType.PRACTICAL,
                listOf( lecturerIllis ),
                mutableListOf()
            ),
            Movie("8",
                "Lecture 5",
                "13.11.2019",
                "Recycler View",
                LessonType.LECTURE,
                listOf( lecturerBloder ),
                mutableListOf()
            ),
            Movie("9",
                "Exercise 5",
                "12.11.2019",
                "Android Basics",
                LessonType.PRACTICAL,
                listOf( lecturerBloder ),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun moviesById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, rating: LessonRating) {
        moviesById(id)?. ratings?.add(rating)
    }
}