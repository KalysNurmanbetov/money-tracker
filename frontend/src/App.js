import React, { Component } from 'react';
import AccountingEntries from './AccountingEntries'

class App extends Component {

  state = {
    accountEntry: [
      { id: 1, desc: "Shoping", amount: 30, isSpent: true },
      { id: 2, desc: "Flat", amount: 200, isSpent: true },
      { id: 3, desc: "Salary", amount: 1000, isSpent: false }
    ]
  }

  render() {
    return (
      <div className="App">
        <h1 className="center">Accounting entries</h1>
        {AccountingEntries(this.state.accountEntry)}
      </div>
    );
  }
}

export default App;
