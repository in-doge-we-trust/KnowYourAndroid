package itis.kpfu.ru.knowyourandroid.ui.lesson

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import itis.kpfu.ru.knowyourandroid.model.Lesson
import itis.kpfu.ru.knowyourandroid.repository.RepositoryProvider

@InjectViewState
class LessonPresenter: MvpPresenter<LessonView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.lessonData()
    }

    fun getLessonInfo(themeName: String, lessonName: String){
        RepositoryProvider.getLessonRepository().getLesson(themeName, lessonName, this)
    }

    fun setLessonInfo(lesson: Lesson){
        viewState.initView(lesson)
    }
}