package scanner.crop


import android.widget.ImageView
import scanner.view.PaperRectangle


class ICropView {
    interface Proxy {
        fun getPaper(): ImageView
        fun getPaperRect(): PaperRectangle
        fun getCroppedPaper(): ImageView
    }
}