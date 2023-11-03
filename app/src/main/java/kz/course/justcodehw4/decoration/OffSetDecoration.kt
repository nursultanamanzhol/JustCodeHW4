package kz.course.justcodehw4.decoration

import android.content.res.Resources
import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class OffSetDecoration(start: Int = 0, top: Int = 0, end: Int = 0, bottom: Int = 0) :
    ItemDecoration() {
    private val startOffSet = start.dp
    private val topOffSet = top.dp
    private val endOffSet = end.dp
    private val bottomOffSet = bottom.dp
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = 16.dp
        outRect.top = 2.dp
        outRect.right = 16.dp
        outRect.bottom = 2.dp
    }
}

val Int.dp
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    ).toInt()

val Float.dp
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )