package ru.alexeysekatskiy.nvvmpractice.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.alexeysekatskiy.nvvmpractice.objects.UserData
import ru.alexeysekatskiy.nvvmpractice.data.User

class UserViewModel: ViewModel() {

    var userList : MutableLiveData<List<User>> = MutableLiveData()

    //инициализируем список и заполняем его данными пользователей
    init {
        userList.value = UserData.getUsers()
    }

    fun getListUsers() = userList

    //для обновления списка передаем второй список пользователей
    fun updateListUsers() {
        userList.value = UserData.getAnotherUsers()
    }
}