class LikesCalc {
    companion object {
        fun getPeopleString(likes: Int): String {
            return if (likes.mod(10) == 1) "$likes человеку" else "$likes людям"
        }
    }
}