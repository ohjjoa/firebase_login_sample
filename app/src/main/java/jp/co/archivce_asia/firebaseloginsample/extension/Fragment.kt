package jp.co.archivce_asia.firebaseloginsample.extension

import androidx.fragment.app.Fragment

fun Fragment.showSnackBar(message: String) = activity?.showSnackBar(message)