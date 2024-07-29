package com.example.myquizapp

object Constants {

    //To store data
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTION:String="total_question"
    const val CORRECT_ANSWER:String="correct_answer"




    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        val que1=Question(
            1, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,"Argentina",
            "Australia","Austria","Germany",
            1
        )
        questionList.add(que1)

        val que2=Question(
            2, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"New Zealand",
            "Australia","Austria","England",
            2
        )
        questionList.add(que2)

        val que3=Question(
            3, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,"France",
            "Belgium","Italy","Spain",
            2
        )
        questionList.add(que3)

        val que4=Question(
            4, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,"Argentina",
            "Portugal","Brazil","Sudan",
            3
        )
        questionList.add(que4)

        val que5=Question(
            5, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,"England",
            "India","Austria","Denmark",
            4
        )
        questionList.add(que5)

        val que6=Question(
            6, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,"Australia",
            "England","Fiji","Japan",
            3
        )
        questionList.add(que6)

        val que7=Question(
            7, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_india,"India",
            "Pakistan","Bangladesh","Nepal",
            1
        )
        questionList.add(que7)

        val que8=Question(
            8, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,"Sri lanka",
            "Australia","Croatia","New Zealand",
            4
        )
        questionList.add(que8)

        val que9=Question(
            9, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,"kuwait",
            "Saudi Arabia","South Africa","UAE",
            1
        )
        questionList.add(que9)

        val que10=Question(
            10, "Which Country does this flag belong to?",
            R.drawable.ic_flag_of_germany,"Spain",
            "France","Italy","Germany",
            4
        )
        questionList.add(que10)

        return questionList
    }
}