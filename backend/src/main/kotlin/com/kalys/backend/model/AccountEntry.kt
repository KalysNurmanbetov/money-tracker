package com.kalys.backend.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
class AccountEntry() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    lateinit var name: String

    lateinit var amount: BigDecimal

    @Enumerated(value = EnumType.STRING)
    lateinit var entryType: AccountEntryType

    constructor(name: String, amount: BigDecimal, entryType: AccountEntryType) : this() {
        this.name = name
        this.amount = amount
        this.entryType = entryType
    }
}