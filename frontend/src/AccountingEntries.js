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
        const entryType = accountEntry.entryType
        switch (entryType) {
            case "COST":
                return (
                    <tr>
                        <td>{accountEntry.name}</td>
                        <td className="red-text darken-4">-{accountEntry.amount}</td>
                    </tr>
                )
            case "PROFIT":
                return (
                    <tr>
                        <td>{accountEntry.name}</td>
                        <td className="green-text darken-4">+{accountEntry.amount}</td>
                    </tr>
                )
        }

    })
    return entries
}

