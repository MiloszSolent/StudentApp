abstract class Student(var id: String, var name: String, var course: String) {
    var mark = 0.0
        set(newMark) {
            if (newMark in 0.0..100.0) {
                field = newMark
            }
        }

    override fun toString(): String {
        return "name: $name, course: $course, mark: $mark"
    }

    abstract fun getGrade(): String

    public fun didPass(): Boolean {
        if (mark >= 40.0) {
            return true
        }
        return false
    }
}

class undergraduate(id: String, name: String, course: String) : Student(id, name, course) {
    public override fun getGrade(): String {
        val Grade = when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.0 -> "2/1"
            in 50.0..59.0 -> "2/2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0-> "Fail"
            else -> ""
        }
        return Grade
    }
}

class masters(id: String, name: String, course: String) : Student(id, name, course) {
    public override fun getGrade(): String {
        val Grade = when (mark) {
            in 70.0..100.0 -> "Distinction"
            in 60.0..69.0 -> "Merit"
            in 40.0..59.0 -> "Pass"
            in 0.0..39.0-> "Fail"
            else -> ""
        }
        return Grade
    }
}

fun main() {
    val under = undergraduate("1234", "Dan", "Science")
    under.mark = 69.0

    val mast = masters("4321", "Mat", "English")
    mast.mark = 69.0

    println("undergraduate: $under with a grade of: ${under.getGrade()}, masters: $mast with a grade of: ${mast.getGrade()}")
}