import React, { Component } from "react";
import "./assets/css/bootstrap.min.css";
import "./assets/css/light-bootstrap-dashboard.css?v=2.0.1";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Dashboard from "./components/Dashboard";
import Navbar from "./components/Navbar";
import Sidebar from "./components/Sidebar";
import AddClient from "./components/Client/AddClient";
import ClientTasks from "./components/Client/ClientTasks";

class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <div className="wrapper">
          <Sidebar />
          <div className="main-panel">
            <Navbar />
            <Switch>
              <Route exact path="/" component={Dashboard} />
              <Route path="/addClient" component={AddClient} />
              <Route path="/clientTasks" component={ClientTasks} />
            </Switch>
          </div>
        </div>
      </BrowserRouter>
    );
  }
}

export default App;
