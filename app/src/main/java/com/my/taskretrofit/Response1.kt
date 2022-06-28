//package com.my.taskretrofit
//
//import com.google.gson.annotations.SerializedName
//
//data class Response1(
//
//	@field:SerializedName("response_code")
//	val responseCode: String? = null,
//
//	@field:SerializedName("commonArr")
//	val commonArr: CommonArr? = null,
//
//	@field:SerializedName("message")
//	val message: String? = null,
//
//	@field:SerializedName("content")
//	val content: Content? = null,
//
//	@field:SerializedName("status")
//	val status: String? = null
//)
//
//data class Location(
//
//	@field:SerializedName("lng")
//	val lng: Double? = null,
//
//	@field:SerializedName("lat")
//	val lat: Double? = null
//)
//
//data class CommonArr(
//
//	@field:SerializedName("token")
//	val token: String? = null
//)
//
//data class RentalPhotos(
//
//	@field:SerializedName("pre_inspection")
//	val preInspection: PreInspection? = null,
//
//	@field:SerializedName("post_inspection")
//	val postInspection: PostInspection? = null
//)
//
//data class Vehicle(
//
//	@field:SerializedName("geotab_device_id")
//	val geotabDeviceId: String? = null,
//
//	@field:SerializedName("odometer")
//	val odometer: String? = null,
//
//	@field:SerializedName("year")
//	val year: String? = null,
//
//	@field:SerializedName("license_plate")
//	val licensePlate: String? = null,
//
//	@field:SerializedName("start_odometer")
//	val startOdometer: String? = null,
//
//	@field:SerializedName("name")
//	val name: String? = null,
//
//	@field:SerializedName("vin_number")
//	val vinNumber: String? = null,
//
//	@field:SerializedName("car_identifier")
//	val carIdentifier: String? = null,
//
//	@field:SerializedName("geotab_serial_number")
//	val geotabSerialNumber: String? = null,
//
//	@field:SerializedName("start_charge")
//	val startCharge: String? = null,
//
//	@field:SerializedName("id")
//	val id: String? = null,
//
//	@field:SerializedName("mileage")
//	val mileage: String? = null,
//
//	@field:SerializedName("remaining_charge")
//	val remainingCharge: String? = null,
//
//	@field:SerializedName("car_icon")
//	val carIcon: String? = null,
//
//	@field:SerializedName("info")
//	val info: String? = null
//)
//
//data class Exterior(
//
//	@field:SerializedName("front_left")
//	val frontLeft: String? = null,
//
//	@field:SerializedName("back_right")
//	val backRight: String? = null,
//
//	@field:SerializedName("front_right")
//	val frontRight: String? = null,
//
//	@field:SerializedName("back_left")
//	val backLeft: String? = null
//)
//
//data class HistoryItem(
//
//	@field:SerializedName("ended_station")
//	val endedStation: String? = null,
//
//	@field:SerializedName("started_station")
//	val startedStation: String? = null,
//
//	@field:SerializedName("started_paking_lane")
//	val startedPakingLane: String? = null,
//
////	@field:SerializedName("rental_photos")
////	val rentalPhotos: RentalPhotos? = null,
//
//	@field:SerializedName("started_at")
//	val startedAt: String? = null,
//
//	@field:SerializedName("ended_parking_lane")
//	val endedParkingLane: String? = null,
//
//	@field:SerializedName("fare_details")
//	val fareDetails: FareDetails? = null,
//
//	@field:SerializedName("ended_at")
//	val endedAt: String? = null,
//
//	@field:SerializedName("rental_id")
//	val rentalId: String? = null,
//
//	@field:SerializedName("vehicle")
//	val vehicle: Vehicle? = null
//)
//
//data class Response(
//
//	@field:SerializedName("current")
//	val current: Current? = null,
//
//	@field:SerializedName("history")
//	val history: List<HistoryItem?>? = null
//)
//
//data class FareDetails(
//
//	@field:SerializedName("total_cost")
//	val totalCost: String? = null,
//
//	@field:SerializedName("total_time")
//	val totalTime: String? = null
//)
//
//data class Origin(
//
//	@field:SerializedName("parking")
//	val parking: String? = null,
//
//	@field:SerializedName("zipcode")
//	val zipcode: String? = null,
//
//	@field:SerializedName("city")
//	val city: String? = null,
//
//	@field:SerializedName("street")
//	val street: String? = null,
//
//	@field:SerializedName("station_id")
//	val stationId: String? = null,
//
//	@field:SerializedName("station")
//	val station: String? = null,
//
//	@field:SerializedName("parking_id")
//	val parkingId: String? = null,
//
//	@field:SerializedName("location")
//	val location: Location? = null
//)
//
//data class PostInspection(
//
//	@field:SerializedName("exterior")
//	val exterior: Exterior? = null,
//
//	@field:SerializedName("interior")
//	val interior: Interior? = null
//)
//
//data class Content(
//
//	@field:SerializedName("response")
//	val response: Response? = null
//)
//
//data class Current(
//
//	@field:SerializedName("reservation")
//	val reservation: List<Any?>? = null,
//
//	@field:SerializedName("rentals")
//	val rentals: Rentals? = null
//)
//
//data class PreInspection(
//
//	@field:SerializedName("exterior")
//	val exterior: Exterior? = null,
//
//	@field:SerializedName("interior")
//	val interior: Interior? = null
//)
//
//data class Interior(
//
//	@field:SerializedName("front_left")
//	val frontLeft: String? = null,
//
//	@field:SerializedName("back_right")
//	val backRight: String? = null,
//
//	@field:SerializedName("front_right")
//	val frontRight: String? = null,
//
//	@field:SerializedName("back_left")
//	val backLeft: String? = null
//)
//
//data class Rentals(
//
//	@field:SerializedName("origin")
//	val origin: Origin? = null,
//
//	@field:SerializedName("cancel_opt")
//	val cancelOpt: String? = null,
//
//	@field:SerializedName("started_at")
//	val startedAt: String? = null,
//
//	@field:SerializedName("step")
//	val step: String? = null,
//
//	@field:SerializedName("rental_id")
//	val rentalId: String? = null,
//
//	@field:SerializedName("vehicle")
//	val vehicle: Vehicle? = null,
//
//	@field:SerializedName("status")
//	val status: String? = null
//)
