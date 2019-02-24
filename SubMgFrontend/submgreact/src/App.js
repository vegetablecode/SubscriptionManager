import React, { Component } from "react";
import "./assets/css/bootstrap.min.css";
import "./assets/css/light-bootstrap-dashboard.css?v=2.0.1";
import { BrowserRouter as Router, Route } from "react-router-dom";
import Dashboard from "./components/Dashboard";
import Navbar from "./components/Navbar";
import Sidebar from "./components/Sidebar";

class App extends Component {
  render() {
    return (
      <Router>
        <div className="wrapper">
          <Sidebar />
          <div className="main-panel">
            <Navbar />
            <Dashboard />
          </div>
        </div>
      </Router>
    );
  }
}

export default App;
