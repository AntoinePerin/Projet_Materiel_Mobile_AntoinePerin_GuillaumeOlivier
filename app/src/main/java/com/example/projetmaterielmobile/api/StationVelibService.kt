package com.example.projetmaterielmobile.api

import com.example.projetmaterielmobile.model.StationVelib
import retrofit2.http.GET

interface StationVelibService {
    @GET("station_information.json")
    suspend fun getLieuStation(): data
}

data class data(val data:getLieuStationResult)
data class getLieuStationResult(val stations : List<StationVelib>)
//data class StationVelib(val station_id:Int,val name:String,val lat:Float,val lon:Float)

