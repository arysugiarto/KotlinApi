package arysugiarto10.id.kotlinapi.main

import arysugiarto10.id.kotlinapi.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}