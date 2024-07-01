package com.kurotkin.netdemoapplication.data

// TODO: 8. Работа с сетевым ресурсом
data class NetResource<T>(val status: Status, val data: T?, val message: String?) {

    enum class Status {
        SUCCESS,
        ERROR
    }

    companion object {
        fun <T> success(data: T): NetResource<T> {
            return NetResource(Status.SUCCESS, data, null)
        }

        fun <T> error(message: String, data: T? = null): NetResource<T> {
            return NetResource(Status.ERROR, data, message)
        }
    }
}