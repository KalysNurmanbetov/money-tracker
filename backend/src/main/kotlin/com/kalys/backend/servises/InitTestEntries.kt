package com.kalys.backend.servises

import com.kalys.backend.model.AccountEntry
import com.kalys.backend.model.AccountEntryType
import com.kalys.backend.repositoriy.AccountEntryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import java.math.BigDecimal

@Configuration
class InitTestEntries @Autowired constructor
(
        private val accountEntryRepository: AccountEntryRepository
) : CommandLineRunner {


    override fun run(vararg args: String) {
        accountEntryRepository.save(AccountEntry(
                name = "Shopping",
                amount = BigDecimal.valueOf(30),
                entryType = AccountEntryType.COST))
        accountEntryRepository.save(AccountEntry(
                name = "Apartment",
                amount = BigDecimal.valueOf(200),
                entryType = AccountEntryType.COST))
        accountEntryRepository.save(AccountEntry(
                name = "Salary",
                amount = BigDecimal.valueOf(1000),
                entryType = AccountEntryType.PROFIT))

    }
}