package com.sematec.android.advanced.dey98.pojo

data class AladhanResponseModel(
    val code: Int,
    val data: Data,
    val status: String
)

data class Data(
    val date: Date,
    val meta: Meta,
    val timings: Timings
)

data class Date(
    val gregorian: Gregorian,
    val hijri: Hijri,
    val readable: String,
    val timestamp: String
)

data class Gregorian(
    val date: String,
    val day: String,
    val designation: Designation,
    val format: String,
    val month: Month,
    val weekday: Weekday,
    val year: String
)

data class Designation(
    val abbreviated: String,
    val expanded: String
)

data class Month(
    val en: String,
    val number: Int
)

data class Weekday(
    val en: String
)

data class Hijri(
    val date: String,
    val day: String,
    val designation: DesignationX,
    val format: String,
    val holidays: List<Any>,
    val month: MonthX,
    val weekday: WeekdayX,
    val year: String
)

data class DesignationX(
    val abbreviated: String,
    val expanded: String
)

data class MonthX(
    val ar: String,
    val en: String,
    val number: Int
)

data class WeekdayX(
    val ar: String,
    val en: String
)

data class Meta(
    val latitude: Double,
    val latitudeAdjustmentMethod: String,
    val longitude: Double,
    val method: Method,
    val midnightMode: String,
    val offset: Offset,
    val school: String,
    val timezone: String
)

data class Method(
    val id: Int,
    val name: String,
    val params: Params
)

data class Params(
    val Fajr: Double,
    val Isha: String
)

data class Offset(
    val Asr: Int,
    val Dhuhr: Int,
    val Fajr: Int,
    val Imsak: Int,
    val Isha: Int,
    val Maghrib: Int,
    val Midnight: Int,
    val Sunrise: Int,
    val Sunset: Int
)

data class Timings(
    val Asr: String,
    val Dhuhr: String,
    val Fajr: String,
    val Imsak: String,
    val Isha: String,
    val Maghrib: String,
    val Midnight: String,
    val Sunrise: String,
    val Sunset: String
)