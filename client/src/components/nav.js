import React from 'react';
import {makeStyles} from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import LocalBarIcon from '@material-ui/icons/LocalBar';

const useStyles = makeStyles(theme => ({
    root: {
        flexGrow: 1,
    },
    menuButton: {
        marginRight: theme.spacing(2),
    },
    title: {
        flexGrow: 1,
        marginLeft: theme.spacing(2),
        fontFamily: 'Playfair Display',
        fontSize: "25pt"
    },
}));

export default function AppNav() {
    const classes = useStyles();

    return (
        <div className={classes.root}>
            <AppBar position="static">
                <Toolbar>
                    <LocalBarIcon/>

                    <Typography variant="h5" className={classes.title}>
                        Beer World
                    </Typography>
                </Toolbar>
            </AppBar>
        </div>
    );
};
