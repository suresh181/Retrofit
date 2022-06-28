//package com.my.taskretrofit
//
//import com.google.gson.annotations.SerializedName
//
//data class ResponseM(
//    @SerializedName("response_code")
//    val responseCode: String? = null,
//
//    @SerializedName("commonArr")
//    val commonArr: CommonArr? = null,
//
//    @SerializedName("message")
//    val message: String? = null,
//
//    @SerializedName("content")
//    val content: Content? = null,
//
//    @SerializedName("status")
//    val status: String? = null
//)
//
//data class Location(
//
//    @SerializedName("lng")
//    val lng: Double? = null,
//
//    @SerializedName("lat")
//    val lat: Double? = null
//)
//
//data class CommonArr(
//
//    @SerializedName("token")
//    val token: String? = null
//)
//
//data class RentalPhotos(
//
//    @SerializedName("pre_inspection")
//    val preInspection: PreInspection? = null,
//
//    @SerializedName("post_inspection")
//    val postInspection: PostInspection? = null
//)
//
//data class Vehicle(
//
//    @SerializedName("geotab_device_id")
//    val geotabDeviceId: String? = null,
//
//    @SerializedName("odometer")
//    val odometer: String? = null,
//
//    @SerializedName("year")
//    val year: String? = null,
//
//    @SerializedName("license_plate")
//    val licensePlate: String? = null,
//
//    @SerializedName("start_odometer")
//    val startOdometer: String? = null,
//
//    @SerializedName("name")
//    val name: String? = null,
//
//    @SerializedName("vin_number")
//    val vinNumber: String? = null,
//
//    @SerializedName("car_identifier")
//    val carIdentifier: String? = null,
//
//    @SerializedName("geotab_serial_number")
//    val geotabSerialNumber: String? = null,
//
//    @SerializedName("start_charge")
//    val startCharge: String? = null,
//
//    @SerializedName("id")
//    val id: String? = null,
//
//    @SerializedName("mileage")
//    val mileage: String? = null,
//
//    @SerializedName("remaining_charge")
//    val remainingCharge: String? = null,
//
//    @SerializedName("car_icon")
//    val carIcon: String? = null,
//
//    @SerializedName("info")
//    val info: String? = null
//)
//
//data class Exterior(
//
//    @SerializedName("front_left")
//    val frontLeft: String? = null,
//
//    @SerializedName("back_right")
//    val backRight: String? = null,
//
//    @SerializedName("front_right")
//    val frontRight: String? = null,
//
//    @SerializedName("back_left")
//    val backLeft: String? = null
//)
//
//data class HistoryItem(
//
//    @SerializedName("ended_station")
//    val endedStation: String? = null,
//
//    @SerializedName("started_station")
//    val startedStation: String? = null,
//
//    @SerializedName("started_paking_lane")
//    val startedPakingLane: String? = null,
//
////	@field:SerializedName("rental_photos")
////	val rentalPhotos: RentalPhotos? = null,
//
//    @SerializedName("started_at")
//    val startedAt: String? = null,
//
//    @SerializedName("ended_parking_lane")
//    val endedParkingLane: String? = null,
//
//    @SerializedName("fare_details")
//    val fareDetails: FareDetails? = null,
//
//    @SerializedName("ended_at")
//    val endedAt: String? = null,
//
//    @SerializedName("rental_id")
//    val rentalId: String? = null,
//
//    @SerializedName("vehicle")
//    val vehicle: Vehicle? = null
//)
//
//data class Response(
//
//    @SerializedName("current")
//    val current: Current? = null,
//
//    @SerializedName("history")
//    val history: List<HistoryItem?>? = null
//)
//
//data class FareDetails(
//
//    @SerializedName("total_cost")
//    val totalCost: String? = null,
//
//    @SerializedName("total_time")
//    val totalTime: String? = null
//)
//
//data class Origin(
//
//    @SerializedName("parking")
//    val parking: String? = null,
//
//    @SerializedName("zipcode")
//    val zipcode: String? = null,
//
//    @SerializedName("city")
//    val city: String? = null,
//
//    @SerializedName("street")
//    val street: String? = null,
//
//    @SerializedName("station_id")
//    val stationId: String? = null,
//
//    @SerializedName("station")
//    val station: String? = null,
//
//    @SerializedName("parking_id")
//    val parkingId: String? = null,
//
//    @SerializedName("location")
//    val location: Location? = null
//)
//
//data class PostInspection(
//
//    @SerializedName("exterior")
//    val exterior: Exterior? = null,
//
//    @SerializedName("interior")
//    val interior: Interior? = null
//)
//
//data class Content(
//
//    @SerializedName("response")
//    val response: Response? = null
//)
//
//data class Current(
//
//    @SerializedName("reservation")
//    val reservation: List<Any?>? = null,
//
//    @SerializedName("rentals")
//    val rentals: Rentals? = null
//)
//
//data class PreInspection(
//
//    @SerializedName("exterior")
//    val exterior: Exterior? = null,
//
//    @SerializedName("interior")
//    val interior: Interior? = null
//)
//
//data class Interior(
//
//    @SerializedName("front_left")
//    val frontLeft: String? = null,
//
//    @SerializedName("back_right")
//    val backRight: String? = null,
//
//    @SerializedName("front_right")
//    val frontRight: String? = null,
//
//    @SerializedName("back_left")
//    val backLeft: String? = null
//)
//
//data class Rentals(
//
//    @SerializedName("origin")
//    val origin: Origin? = null,
//
//    @SerializedName("cancel_opt")
//    val cancelOpt: String? = null,
//
//    @SerializedName("started_at")
//    val startedAt: String? = null,
//
//    @SerializedName("step")
//    val step: String? = null,
//
//    @SerializedName("rental_id")
//    val rentalId: String? = null,
//
//    @SerializedName("vehicle")
//    val vehicle: Vehicle? = null,
//
//    @SerializedName("status")
//    val status: String? = null
//)