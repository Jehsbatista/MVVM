package ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import domain.PersonRepository


class MainViewModel : ViewModel() {
    private var textWelcome =
        MutableLiveData<String>()
    private var login = MutableLiveData<Boolean>()

    private val personrepository = PersonRepository()

    init {
        textWelcome.value = "Olá"
    }

    fun welcome(): LiveData<String> {
        return textWelcome
    }

    fun login(): LiveData<Boolean> {
        return login
    }

    fun dologin(email: String, password: String) {
        login.value = personrepository.login(
            email,
            password
        )
    }
}