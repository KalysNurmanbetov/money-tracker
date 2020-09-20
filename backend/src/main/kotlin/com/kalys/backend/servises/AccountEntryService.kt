package com.kalys.backend.servises

import com.kalys.backend.model.AccountEntry
import com.kalys.backend.repositoriy.AccountEntryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountEntryService @Autowired constructor
(
        private val accountEntryRepository: AccountEntryRepository
) {



    fun getAllAccountEntries(): List<AccountEntry> {
        return accountEntryRepository.findAll()
    }
}