import {CHANGE_CONTENT} from './actionType';

const defaultState = {
    content:"A",
};

export default (state = defaultState, action) => {
    if (action.type === CHANGE_CONTENT) {
        let newState = JSON.parse(JSON.stringify(state));
        newState.content = action.value;
        // newState.content = "B";
        return newState;
    }
    return state;
}

