import React from 'react'

export default function AccountingEntries(accountEntries) {
    return accountEntries.length ? (
        <table className="highlight container">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Ammount</th>
                </tr>
            </thead>
            <tbody>
                {createAccountingEntry(accountEntries)}
            </tbody>
        </table>
    ) : (<p className='center'>You have nothing to track</p>)
}

function createAccountingEntry(accountEntries) {
    const entries = accountEntries.map(accountEntry => {
        const isSpent = accountEntry.isSpent
        return (
            <tr>
                <td>{accountEntry.desc}</td>
                <td className={isSpent ? "red-text darken-4" : "green-text darken-4"}>
                    {isSpent ? "-" : "+"}{accountEntry.amount}</td>
            </tr>
        )
    })
    return entries
}

