package com.maximilianried.parcelbackend.service

import com.maximilianried.parcelbackend.model.Parcel

interface ParcelService {

    def saveParcel(Parcel parcel)
    def List<Parcel> getAllParcels()
    def getParcel(Long id)
    def deleteParcel(Long id)
    def deleteAllParcels()
    def changeStatus(Long id, Integer status)
}