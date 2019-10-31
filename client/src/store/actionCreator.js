import Axios from "axios";
import {CHANGE_CONTENT} from "./actionType";

const BEER_API_BASE_URL = 'http://172.17.0.5/8080/api';

export const getFetchDataAction = () => {
    return ((dispatch) => {
        Axios.get(BEER_API_BASE_URL + '/beer/random').then((resp) => {
            let action = {
                type: CHANGE_CONTENT,
                value: resp.data,
            };
            dispatch(action);
        }).catch(() => {
            // alert("fail");
        })
    })
};