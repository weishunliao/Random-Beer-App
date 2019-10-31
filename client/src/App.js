import React, {Component} from 'react';
import './App.css';
import AppNav from './components/nav.js'
import CenteredGrid from './components/content.js';
import {getFetchDataAction} from "./store/actionCreator";
import store from "./store";


class App extends Component {
    constructor(props) {
        super(props);
        this.state = store.getState();
        store.subscribe(this.handleChange);
    }

    render() {
        return (
            <div className="">
                <AppNav/>
                <CenteredGrid content={this.state.content}
                              handleBeerChange={this.handleBeerChange}
                />
            </div>
        );
    }
    componentDidMount() {
        let action = getFetchDataAction();
        store.dispatch(action);

    }

    handleBeerChange() {
        let action = getFetchDataAction();
        store.dispatch(action);
    }
    handleChange = () => {
        this.setState(store.getState());
    };

}

export default App;
