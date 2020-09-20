package com.kalys.backend.repositoriy

import com.kalys.backend.model.AccountEntry
import org.springframework.data.jpa.repository.JpaRepository

interface AccountEntryRepository : JpaRepository<AccountEntry, Long> {
}