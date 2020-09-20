package com.kalys.backend.controller

import com.kalys.backend.model.AccountEntry
import com.kalys.backend.servises.AccountEntryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/entries")
class AccountEntryController @Autowired constructor
(
        private val accountEntryService: AccountEntryService
) {

    @GetMapping
    fun getAllAccountEntries(): List<AccountEntry> {
        return accountEntryService.getAllAccountEntries()
    }
}