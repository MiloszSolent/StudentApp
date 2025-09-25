class Student(var id: String, var name: String, var course: String, var mark: Double) {
    override fun toString(): String {
        return "name: $name, course: $course, mark: $mark"
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