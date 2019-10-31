import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Button from '@material-ui/core/Button';

const useStyles = makeStyles(theme => ({
    button: {
        margin: theme.spacing(3),
    },
    input: {
        display: 'none',
    },
}));

export default function Buttons(props) {
    const classes = useStyles();

    return (
        <div style={{textAlign:"center"}}>
            {/*<Button variant="contained" className={classes.button}>*/}
            {/*    Default*/}
            {/*</Button>*/}
            <Button variant="contained" color="primary" className={classes.button} onClick={props.handleBeerChange}>
                Get new one!
            </Button>
            {/*<Button variant="contained" className={classes.button}>*/}
            {/*    Default*/}
            {/*</Button>*/}
        </div>
    );
}
