package com.kalys.backend.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class AccountEntry(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val name: String,

        val amount: BigDecimal,

        @Enumerated(value = EnumType.STRING)
        val entryType: AccountEntryType
)