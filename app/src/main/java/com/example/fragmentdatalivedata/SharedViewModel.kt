package com.example.fragmentdatalivedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SharedViewModel(
    var liveText : MutableLiveData<String> = MutableLiveData()
) : ViewModel()