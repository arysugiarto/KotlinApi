package arysugiarto10.id.kotlinapi.api

import arysugiarto10.id.kotlinapi.BuildConfig

object TheSportDBApi {
    fun getTeams(league: String?): String{
        return BuildConfig.BASE_URL +"api/v1/json/${BuildConfig.TSBD_API_KEY}"+"/search_all_teams.php?l="+league
    }
}