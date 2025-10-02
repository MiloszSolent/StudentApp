class Student(var id: String, var name: String, var course: String, var mark: Double) {
    var studentMark = 0.0
        set(newMark) {
            if (newMark >= 0.0 && newMark <= 100.0) {
                field = newMark
            }
        }

    init {
        studentMark = mark
    }

    override fun toString(): String {
        return "name: $name, course: $course, mark: $studentMark"
    }

    public fun getGrade(): String {
        val Grade = when (studentMark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.0 -> "2/1"
            in 50.0..59.0 -> "2/2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0-> "Fail"
            else -> ""
        }
        return Grade
    }

    public fun didPass(): Boolean {
        if (studentMark >= 40.0) {
            return true
        }
        return false
    }
}

fun main() {
    var student_name = ""

    while (student_name != "quit") {
        println("Input student id:")
        val student_id = readln()

        println("Input student name:")
        student_name = readln()

        println("Input student course:")
        val student_course = readln()

        println("Input student mark:")
        val student_mark = readln().toDouble()

        var student = Student(student_id, student_name, student_course, student_mark)
        println(student)
    }
}