package project.lonelywheeler.db.service.api

import project.lonelywheeler.db.entity.offer.OfferEntity
import project.lonelywheeler.db.entity.offer.vehicle.motor.MotorVehicleEntity
import project.lonelywheeler.db.response.MyResponse
import retrofit2.http.*

interface MotorVehicleApi {

    @POST("motor-vehicles/persist")
    suspend fun createOrUpdate(@Body motorVehicleEntity: MotorVehicleEntity): MyResponse<MotorVehicleEntity>

    @GET("motor-vehicles/read")
    suspend fun readAll(): MyResponse<List<OfferEntity>>

    @GET("motor-vehicles/read/{id}")
    suspend fun read(@Path("id") id: String): MyResponse<MotorVehicleEntity>

    @DELETE("motor-vehicles/delete/{id}")
    suspend fun delete(@Path("id") id: String): MyResponse<MotorVehicleEntity>


}