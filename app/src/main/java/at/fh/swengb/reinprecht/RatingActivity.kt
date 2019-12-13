package at.fh.swengb.reinprecht

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RatingActivity : AppCompatActivity() {
    private val rating = Rating("android_lesson_01")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
    }

    fun saveRating(v: View) {
        rating.feedback = feedback_input.text.toString()
        rating.rating = rating_bar.rating.toDouble()

        lesson.text = rating.lesson
        feedback.text = rating.feedback
        rating_value.text = rating.rating?.toString() ?: "0"
    }
}
