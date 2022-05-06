package me.teste.bankline_androi.ui.statement

import androidx.lifecycle.ViewModel
import me.teste.bankline_androi.data.banklineRepository

class BankStatementViewModel: ViewModel() {
    fun findBankStatement(accountHolderId: Int) =
        banklineRepository.findBankStatement(accountHolderId)
}