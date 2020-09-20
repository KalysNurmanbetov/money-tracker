import React, { Component } from 'react';
import AccountingEntries from './AccountingEntries'

class App extends Component {

  state = {
    accountEntry: []
  }

  initEntries() {
    fetch('/entries')
      .then(response => response.json())
      .then(data => {
        console.log(data)
        this.setState({
          accountEntry: data
        })
      })
  }

  render() {
    this.initEntries()
    return (
      <div className="App">
        <h1 className="center">Accounting entries</h1>
        {AccountingEntries(this.state.accountEntry)}
      </div>
    );
  }
}

export default App;
